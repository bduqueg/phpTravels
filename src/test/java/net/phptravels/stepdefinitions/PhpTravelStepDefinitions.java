package net.phptravels.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.phptravels.questions.Consulta;
import net.phptravels.tasks.AbrirPagina;
import net.phptravels.tasks.Login;
import net.phptravels.tasks.PrincipalPage;
import net.phptravels.util.Constantes;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class PhpTravelStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que el usuario inicie sesion en el portal web$")
    public void queElUsuarioInicieSesionEnElPortalWeb() {
        OnStage.theActorCalled("Usuario").wasAbleTo(
                AbrirPagina.dePhpTravel(),
                Login.phpTravel(Constantes.USUARIO, Constantes.PASSWORD)
        );
    }

    @When("^crea una nueva categoria$")
    public void creaUnaNuevaCategoria() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                PrincipalPage.crearCategoriaBlog()
        );
    }

    @And("^valida que la categoria haya quedado agregada como (.*)$")
    public void validaQueLaCategoriaHayaQuedadoAgregada(String validacion) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("el nombre de la categoria es : " + Constantes.CATEGORYNAME, Consulta.valorCategoria(validacion))
        );
    }

    @Then("^crea el nuevo post$")
    public void creaElNuevoPost() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                PrincipalPage.crearPost()
        );
    }

    @And("^valida que haya quedado agregado el post como (.*)$")
    public void validaQueHayaQuedadoAgregadoElPost(String validacion) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("el nombre del post es :" + Constantes.TEXTO_NAMEPOST, Consulta.valorPost(validacion))
        );
    }
}

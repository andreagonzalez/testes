package cucumber.teste;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//Esta classe tem como objetivo fazer a chamada para a execu��o dos passos (os testes de aceita��o) 
//contidas na classe ContaTestePassos.java.


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:caracteristicas", tags = "@ContaTeste",
glue = "cucumber.teste.passos", monochrome = true, dryRun = false)

public class ContaTeste {
	

}

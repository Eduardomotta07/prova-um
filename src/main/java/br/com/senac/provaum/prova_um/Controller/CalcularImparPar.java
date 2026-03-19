package br.com.senac.provaum.prova_um.Controller;


import br.com.senac.provaum.prova_um.dtos.CalcularImparParDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/prova")
@CrossOrigin

public class CalcularImparPar {

    @GetMapping("/validarNumero")

public ResponseEntity<CalcularImparParDTO> validarNumero (@RequestParam Double numero){

        CalcularImparParDTO resultado = new CalcularImparParDTO();
        resultado.setRestoDivisao(numero % 2);

        if (resultado.getRestoDivisao() == 0){
            resultado.setImparPar("Par");

        } else{
            resultado.setImparPar("Impar");
        }

        return ResponseEntity.ok(resultado);

    }

}

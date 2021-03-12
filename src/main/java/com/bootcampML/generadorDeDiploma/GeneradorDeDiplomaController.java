package com.bootcampML.generadorDeDiploma;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneradorDeDiplomaController {

    @PostMapping("/calculador")
    @ResponseBody
    public DiplomaDTO obtenerDiploma(@RequestBody Alumno alumno) {

        DiplomaDTO diploma = new DiplomaDTO();

        String feli = "";
        Integer prom = calcularPromedio(alumno);
        if (prom >= 9) {
            feli = "¡¡FELICITACIONES POR TU EXELENTE PROMEDIO!!";
        }

        diploma.setNombre(alumno.getNombre());
        diploma.setPromedio(prom);
        diploma.setMensaje("");
        diploma.setFelicitacion(feli);
        return diploma;
    }

    private Integer calcularPromedio(Alumno alumno) {
        int nota = 0;
        for (Integer i : alumno.getMaterias().values()) {
            nota = nota + i;
        }
        return nota / alumno.getMaterias().size();
    }
}

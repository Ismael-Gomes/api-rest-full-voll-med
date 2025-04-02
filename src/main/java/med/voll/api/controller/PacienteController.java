package med.voll.api.controller;

import med.voll.api.domain.paciente.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    PacienteRepository pacienteRepository;

}

package med.voll.api.controller;

import med.voll.api.domain.medico.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;


}

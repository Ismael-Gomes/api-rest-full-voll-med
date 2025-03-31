package med.voll.api.domain.paciente;

import jakarta.persistence.*;
import lombok.*;
@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;


    private Boolean ativo;

}

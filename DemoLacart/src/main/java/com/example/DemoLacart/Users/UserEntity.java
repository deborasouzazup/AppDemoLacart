@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class UserEntity {

//    @Id
//    @GeneratedValue(generator = "system-uuid")
//    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Column(nullable = false, unique = true)
    private String telefone;
    @Column(nullable = false)
    private String uf;
    @Column(nullable = false)
    private String cep;
    @Column(nullable = false)
    private String localidade;
    @Column(nullable = false)
    @Enumerated (EnumType.STRING)
    private Genero genero;
    @Column(nullable = false)
    private String senha;
    @OneToOne (cascade =  CascadeType.ALL)
    private Preferencia preferencia;

}




@RestController
@RequestMapping("usuario")
public class UsersController {

//    @Autowired
//    private UsuarioService usuarioService;
//
//    @Autowired
//    private ModelMapper modelMapper;

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public void cadastrarUsuario(@RequestBody @Valid UsuarioRequisicaoDTO usuarioRequisicaoDTO) throws Exception {
//        Usuario usuario = modelMapper.map(usuarioRequisicaoDTO, Usuario.class);
//        usuarioService.salvarUsuario(usuario);
//    }
//
//    @GetMapping
//    public List<ResumoCadastroDTO> buscarUsuarios(@RequestParam(required = false) @Valid String uf,
//                                                  @RequestParam(required = false)String localidade,
//                                                  @RequestParam(required = false) Genero genero,
//                                                  @RequestParam (required = false) Boolean temPet,
//                                                  @RequestParam (required = false) Boolean fumante,
//                                                  @RequestParam (required = false) TipoDePet tipoDePet){
//        List<ResumoCadastroDTO> listaResumo = new ArrayList<>();
//        for (Usuario usuario: usuarioService.buscarUsuarios(uf, localidade, genero, temPet, fumante, tipoDePet)){
//            if (usuario.getPreferencia().isDisponivelParaReceberUmZupper()){
//                ResumoCadastroDTO resumo = modelMapper.map(usuario, ResumoCadastroDTO.class);
//                resumo.setIdade(usuarioService.calcularIdade(usuario.getDataNascimento()));
//                listaResumo.add(resumo);
//            }
//
//        }
//        return listaResumo;
//    }
//    @GetMapping("/{id}")
//    public UsuarioRespostaDTO exibirUsuarioPorId(@PathVariable String id){
//        Usuario usuario = usuarioService.buscarUsuarioPorId(id);
//        UsuarioRespostaDTO usuarioRespostaDTO = modelMapper.map(usuario, UsuarioRespostaDTO.class);
//        usuarioRespostaDTO.setIdade(usuarioService.calcularIdade(usuario.getDataNascimento()));
//
//        return usuarioRespostaDTO;
//    }
//    @GetMapping("/match/{uf}")
//    public List<ComparacaoUsuarioDTO> compararUsuarios (@PathVariable String uf) {
//        List<Usuario> usuariosFiltrados = usuarioService.listarUsuariosPorUf(uf);
//        List<ComparacaoUsuarioDTO> comparacaoUsuarioDTOList = new ArrayList<>();
//
//        for (Usuario usuarioReferencia : usuariosFiltrados ){
//            ComparacaoUsuarioDTO comparacaoUsuarioDTO = modelMapper.map(usuarioReferencia, ComparacaoUsuarioDTO.class);
//            double quantidadeCombinacoes = usuarioService.compararUsuarios(
//                    usuarioReferencia, usuarioService.buscarUsuarioLogado());
//            double porcentagemMatch = usuarioService.calcularPorcentagemCombinacoes(quantidadeCombinacoes);
//            double valorFormatado = Math.round(porcentagemMatch);
//
//            comparacaoUsuarioDTO.setPorcentagemMatch(valorFormatado);
//            if (usuarioReferencia != usuarioService.buscarUsuarioLogado()){
//                comparacaoUsuarioDTOList.add(comparacaoUsuarioDTO);
//            }
//
//        }
//        return comparacaoUsuarioDTOList;
//
//    }
//
//    @PutMapping("/dados/{id}")
//    public UsuarioAtualizarDadosDTO atualizarDadosUsuario(@PathVariable String id, @Valid
//
//    @RequestBody UsuarioRequisicaoAtualizarDadosDTO usuarioRequisicaoAtualizarDadosDTO){
//        UsuarioAtualizarDadosDTO usuarioAtualizarDadosDTO;
//        Usuario usuario = modelMapper.map(usuarioRequisicaoAtualizarDadosDTO, Usuario.class);
//        Usuario usuarioAtualizar = usuarioService.atualizarDadosUsuario(id, usuario);
//        usuarioAtualizarDadosDTO = modelMapper.map(usuarioAtualizar, UsuarioAtualizarDadosDTO.class);
//
//        return usuarioAtualizarDadosDTO;
//    }
//
//    @PutMapping ("/login/{id}")
//    public void atualizarDadosDeLoginUsuario(@PathVariable String id,
//                                             @RequestBody LoginDTO loginDTO){
//        Usuario usuario = modelMapper.map(loginDTO, Usuario.class);
//        usuarioService.atualizarDadosLoginUsuario(id, usuario);
//
//    }
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deletarUsuario(@PathVariable String id){
//        usuarioService.deletarUsuario(id);
//    }
}
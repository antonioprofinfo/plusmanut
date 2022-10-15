package pos.maismanut.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pos.maismanut.model.entity.Cliente;
import pos.maismanut.model.repository.ClienteRepository;

import javax.validation.Valid;
@Controller
@RestController
@RequestMapping("/api/clientes")
@CrossOrigin("http://localhost:4200")
public class ClienteController {

    //Variável para a Injeção de dependencia.
    private final ClienteRepository repository;

    //Injeção de dependencia
    @Autowired
    public ClienteController(ClienteRepository repository){
        this.repository = repository;
    }

    //Create Cliente
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody @Valid Cliente cliente){
        return repository.save(cliente);
    }

    //Read Cliente
    @GetMapping("{id}")
    public Cliente selectClient(@PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    //Delete Cliente
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCliente(@PathVariable Integer id){
       repository
               .findById(id)
               .map(cliente -> {
                   repository.delete(cliente);
                   return Void.TYPE;
               })
               .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    //Update Cliente
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCliente(@PathVariable @Valid Integer id, @RequestBody Cliente atualizarCliente){
        repository
                .findById(id)
                .map(cliente -> {
                    //Primeira Forma
                    /*atualizarCliente.setId(cliente.getId());
                    return repository.save(atualizarCliente);*/

                    //Segunda forma
                    cliente.setNome(atualizarCliente.getNome());
                    cliente.setCpf(atualizarCliente.getCpf());
                    return repository.save(cliente);

                })
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}

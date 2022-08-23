package com.contabancaria.Controller;
 import com.contabancaria.model.ContaBancariaModel;
 import com.contabancaria.model.ContaBancariaFactory.ContaBancariaFactory;
import com.contabancaria.Service.ContaBancariaService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.HttpStatus;
 import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.*;

 import java.util.List;
 import java.util.Optional;

@RestController
public class ContaController {
 @Autowired
 private ContaBancariaService contasService;

 @GetMapping(path = "/contas")
 public ResponseEntity<List<ContaBancariaModel>> buscarTodasContas() {
  return ResponseEntity.ok(contasService.buscarTodas());
 }

 @GetMapping(path = "/contas/{codigo}")
 public ResponseEntity<Optional<ContaBancariaModel>> buscarContaPorId(@PathVariable Long codigo) {
  return ResponseEntity.ok(contasService.buscarPorId(codigo));
 }

 @PostMapping(path = "/contas")
 public ResponseEntity<ContaBancariaModel> cadastrarConta(@RequestBody ContaBancariaModel contasModel, ContaBancariaFactory contaFactory) {
  ContaBancariaModel novaConta = contasService.cadastrar(contasModel, contaFactory);
  return new ResponseEntity<>(novaConta, HttpStatus.CREATED);
 }

 @DeleteMapping(path = "/contas/{codigo}")
 public void deletarConta(@PathVariable Long codigo) {
  contasService.deletar(codigo);
 }
}

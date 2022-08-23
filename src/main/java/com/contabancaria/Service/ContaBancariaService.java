package com.contabancaria.Service;
import com.contabancaria.model.ContaBancariaModel;
import com.contabancaria.model.ContaBancariaFactory.ContaBancariaFactory;
import com.contabancaria.Repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContaBancariaService {
    @Autowired
    private ContaRepository contaRepository;

    public List<ContaBancariaModel> buscarTodas() {
        return contaRepository.findAll();
    }

    public Optional<ContaBancariaModel> buscarPorId(Long codigo) {
        return contaRepository.findById(codigo);
    }

    public ContaBancariaModel cadastrar(ContaBancariaModel contasModel, ContaBancariaFactory contaFactory) {
        BigDecimal valorfinal = contaFactory.getStatusConta(contasModel.getTipoDeServico()).calcularValorFinal(contasModel.getValorAtualDaConta(), contasModel.getValorFornecido());
        contasModel.getCodigo();
        contasModel.getNumeroDaConta();
        contasModel.getAgencia();
        contasModel.getNomeDoUsuario();
        contasModel.getValorFornecido();
        contasModel.getTipoDeServico();
        contasModel.setValorFinal(valorfinal);
        return contaRepository.save(contasModel);
    }

    public void deletar(Long codigo) {
        contaRepository.deleteById(codigo);
    }
}

package com.contabancaria.Repository;
import com.contabancaria.model.ContaBancariaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<ContaBancariaModel, Long> { }

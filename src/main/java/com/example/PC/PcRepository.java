package com.example.PC;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PcRepository extends JpaRepository <PcHardware, Long> {
    public List<PcHardware> findById(PcHardware pcHardware);
}

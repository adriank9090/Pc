package com.example.PC;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

xx
@Entity
public class PcHardware {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
/*    @OneToOne
    private Processor processor;*/

    private String name;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Processor processor;
/*    @OneToOne(cascade = CascadeType.PERSIST)
    private Ram ram;*/

}

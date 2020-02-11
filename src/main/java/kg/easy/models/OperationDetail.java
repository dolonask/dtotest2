package kg.easy.models;

import lombok.Data;

@Data
public class OperationDetail {

    private Long id;
    private Good good;
    private double amount;
    private Operation operation;


}

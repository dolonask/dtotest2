package kg.easy;

import kg.easy.models.Good;
import kg.easy.models.Operation;
import kg.easy.models.OperationDetail;
import kg.easy.models.dto.OperationDto;
import kg.easy.services.ClassMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    private static ClassMapper classMapper = ClassMapper.INSTANCE;


    public static void main(String[] args) {

        Good good = new Good();
        good.setId(1l);
        good.setName("Молоко");
        good.setPrice(40.0);
        good.setAmount(100);

        Operation operation = new Operation();
        operation.setDate(new Date());
        operation.setId(2l);

        OperationDetail operationDetail = new OperationDetail();
        operationDetail.setGood(good);
        operationDetail.setId(3l);
        operationDetail.setAmount(30);
        operationDetail.setOperation(operation);

        List<OperationDetail> operationDetails = Arrays.asList(operationDetail);


        List<OperationDto> operationDtos = new ArrayList<OperationDto>();



        /*
            Good -> GoodDto
            OperationDetail -> OperationDetailDto
            Operation -> OperationDto
         */




    }
}

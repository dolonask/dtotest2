package kg.easy.services;

import kg.easy.models.Good;
import kg.easy.models.Operation;
import kg.easy.models.OperationDetail;
import kg.easy.models.dto.GoodDto;
import kg.easy.models.dto.OperationDetailDto;
import kg.easy.models.dto.OperationDto;
import kg.easy.services.impl.ClassMapperImpl;

import java.util.List;

public interface ClassMapper {

    ClassMapper INSTANCE = new ClassMapperImpl();

    GoodDto goodToGoodDto(Good good);
    Good goodDtoToGood(GoodDto goodDto);

    Operation operationDtoToOperation(OperationDto operationDto);
    OperationDto operationToOperationDto(Operation operation);

    List<OperationDetail> operationDetailDtosToOperationDetails(List<OperationDetailDto> operationDetailDtos);
    List<OperationDetailDto> operationDetailsToOperationDetailDtos(List<OperationDetail> operationDetails);

}

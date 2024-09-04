package subscribers.clearbunyang.domain.consultation.model.request;


import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import subscribers.clearbunyang.domain.consultation.entity.enums.Medium;
import subscribers.clearbunyang.domain.consultation.entity.enums.Status;
import subscribers.clearbunyang.domain.consultation.entity.enums.Tier;
import subscribers.clearbunyang.global.validation.NumericValidation;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewCustomerAdditionRequest {

    @NotBlank private String name; // 고객 이름

    @NotBlank
    @Size(min = 1, max = 12)
    @NumericValidation
    private String phoneNumber; // 고객 폰 번호

    // @NotBlank 테스트를 위해 주석
    private String consultant; // 상담사

    @NotNull @FutureOrPresent private LocalDate preferredAt;

    private String consultingMessage; // 상담원 작성 메세지

    private Tier tier; // 등급

    private Status status; // 상태

    private Medium medium;
}

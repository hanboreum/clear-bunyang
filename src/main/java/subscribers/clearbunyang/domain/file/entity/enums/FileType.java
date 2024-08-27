package subscribers.clearbunyang.domain.file.entity.enums;


import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.stream.Stream;

public enum FileType { // 파일 타입
    SUPPLY_INFORMATION, // 공급 안내표
    PROPERTY_IMAGE, // 물건 이미지
    MARKETING, // 마케팅 자료
    REGISTRATION, // 사업자 등록 파일
    HOUSING, // ??
    pdf // 에러 때문에 생성
;

    @JsonCreator
    public static FileType fromString(String value) {
        return Stream.of(FileType.values())
                .filter(status -> status.toString().equals(value.toUpperCase()))
                .findAny()
                .orElse(null);
    }
}

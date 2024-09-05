package subscribers.clearbunyang.domain.consultation.repository.dashboard;


import java.time.LocalDate;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import subscribers.clearbunyang.domain.consultation.model.dashboard.ConsultationDateStatsDTO;
import subscribers.clearbunyang.domain.consultation.model.dashboard.PropertiesInquiryStatsDTO;
import subscribers.clearbunyang.domain.consultation.model.dashboard.PropertyInquiryDetailsDTO;
import subscribers.clearbunyang.domain.consultation.model.dashboard.PropertyInquiryStatusDTO;
import subscribers.clearbunyang.domain.consultation.model.dashboard.PropertySelectDTO;

public interface DashboardRepository {
    List<PropertySelectDTO> findPropertySelects(Long adminId);

    PropertyInquiryStatusDTO findTodayStats(Long adminId);

    List<ConsultationDateStatsDTO> findLastFiveWeeksStats(Long adminId);

    List<PropertyInquiryStatusDTO> findStatsOrderByCountDesc(Long adminId);

    Page<PropertiesInquiryStatsDTO> findPropertiesInquiryStats(Long adminId, Pageable pageable);

    PropertyInquiryDetailsDTO findPropertyInquiryDetails(
            Long propertyId, LocalDate start, LocalDate end);
}

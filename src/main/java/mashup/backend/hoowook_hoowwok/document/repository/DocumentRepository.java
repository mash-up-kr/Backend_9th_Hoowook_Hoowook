package mashup.backend.hoowook_hoowwok.document.repository;

import mashup.backend.hoowook_hoowwok.document.domain.document.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}

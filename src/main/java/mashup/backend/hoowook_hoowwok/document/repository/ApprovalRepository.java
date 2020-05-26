package mashup.backend.hoowook_hoowwok.document.repository;

import mashup.backend.hoowook_hoowwok.document.domain.approval.Approval;
import mashup.backend.hoowook_hoowwok.document.domain.approval.ApprovalId;
import org.springframework.data.jpa.repository.JpaRepository;

interface ApprovalRepository extends JpaRepository<Approval, ApprovalId> {
}

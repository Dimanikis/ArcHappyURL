package academy.prog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<UrlRecord, Long> {
    long count();
    UrlRecord findByUrl(String url);
}

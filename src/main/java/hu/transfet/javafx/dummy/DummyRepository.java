package hu.transfet.javafx.dummy;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyRepository extends JpaRepository<Dummy, Integer> {
}

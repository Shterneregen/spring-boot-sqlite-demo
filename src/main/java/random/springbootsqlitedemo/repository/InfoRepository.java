package random.springbootsqlitedemo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import random.springbootsqlitedemo.entity.Info;

public interface InfoRepository extends PagingAndSortingRepository<Info, Long> {
}

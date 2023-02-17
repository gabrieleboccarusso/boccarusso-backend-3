package boccarusso.DAO;

import java.util.Optional;

public interface DAO<T> {
 Optional<T> get(String id);

 T getExisting(String id);

 Iterable<T> getAll();

 T save(T t);

 boolean delete(String id);

 void deleteExisting(String id);

 boolean exists(String id);
}

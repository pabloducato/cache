package pl.kocan.cache.repository;

import pl.kocan.cache.model.User;

import java.util.Map;

public interface UserRepository {

    void save(User user);

    Map<Object, Object> findAll();

    User findById(String id);

    void update(User user);

    void delete(String id);

}

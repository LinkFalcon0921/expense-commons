package com.flintcore.expenses.commons.services;

import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ICrudService<T, ID> {
    Pageable DEFAULT_PAGE = Pageable.ofSize(10);

    Optional<T> getById(ID id);
    Optional<T> create(T t);
    List<T> create(Collection<T> t);
    Optional<T> update(String id,T t);
    void delete(ID id) throws RuntimeException;
    Collection<T> getAll();
    Collection<T> getAll(Pageable pageable);
}
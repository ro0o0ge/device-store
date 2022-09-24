package com.devices.store.integration.repos;


import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import com.devices.store.common.entity.Device;

import java.util.List;


@Repository
public interface DeviceRepository extends JpaRepository<Device,Long> {

    @Query(
           value = "SELECT U FROM devices U inner join mobile_application_info M on U.mob_app_id = M.id"
           		+ " WHERE M.app_version=?1 AND M.app_platform?2"
    )
    public Device getDeviceByPlatformAndVersion(String version, String platform);

    @java.lang.Override
    default java.util.List<Device> findAll() {
        return null;
    }

    @java.lang.Override
    default java.util.List<Device> findAll(Sort sort) {
        return null;
    }

    @java.lang.Override
    default Page<Device> findAll(Pageable pageable) {
        return null;
    }

    @java.lang.Override
    default long count() {
        return 0;
    }

    @java.lang.Override
    default void deleteById(Long aLong) {

    }

    @java.lang.Override
    default void delete(Device entity) {

    }

    @java.lang.Override
    default void deleteAll(java.lang.Iterable<? extends Device> entities) {

    }

    @java.lang.Override
    default void deleteAll() {

    }

    @java.lang.Override
    default <S extends Device> S save(S entity) {
        return null;
    }

    @java.lang.Override
    default <S extends Device> java.util.List<S> saveAll(java.lang.Iterable<S> entities) {
        return null;
    }

    @java.lang.Override
    default java.util.Optional<Device> findById(Long aLong) {
        return java.util.Optional.empty();
    }

    @java.lang.Override
    default boolean existsById(Long aLong) {
        return false;
    }

    @java.lang.Override
    default void flush() {

    }

    @java.lang.Override
    default <S extends Device> S saveAndFlush(S entity) {
        return null;
    }

    @java.lang.Override
    default <S extends Device> java.util.List<S> saveAllAndFlush(java.lang.Iterable<S> entities) {
        return null;
    }

    @java.lang.Override
    default void deleteAllInBatch(java.lang.Iterable<Device> entities) {

    }

    @java.lang.Override
    default void deleteAllInBatch() {

    }

    @java.lang.Override
    default Device getOne(Long aLong) {
        return null;
    }

    @java.lang.Override
    default Device getById(Long aLong) {
        return null;
    }

    @java.lang.Override
    default Device getReferenceById(Long aLong) {
        return null;
    }

    @java.lang.Override
    default <S extends Device> java.util.Optional<S> findOne(Example<S> example) {
        return java.util.Optional.empty();
    }

    @java.lang.Override
    <S extends Device> java.util.List<S> findAll(Example<S> example);

    @java.lang.Override
    default <S extends Device> java.util.List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @java.lang.Override
    default <S extends Device> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @java.lang.Override
    default <S extends Device> long count(Example<S> example) {
        return 0;
    }

    @java.lang.Override
    default <S extends Device> boolean exists(Example<S> example) {
        return false;
    }

    @java.lang.Override
    default <S extends Device, R> R findBy(Example<S> example, java.util.function.Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Query(
            value = "SELECT U FROM devices U inner join users M on U.user_id = M.id"
            		+ " WHERE M.username=?1"
     )
    public Device getDevicesByUsername(String userName);
    
    public boolean addDevice (Device d);
}

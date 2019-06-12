package io.chergey.cache;

public interface CacheCreator {
    <K, V> Cache<K, V> getOrCreateCache(String name);
}

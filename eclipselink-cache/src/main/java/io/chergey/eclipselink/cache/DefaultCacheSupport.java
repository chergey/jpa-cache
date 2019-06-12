package io.chergey.eclipselink.cache;

import io.chergey.cache.Cache;
import io.chergey.cache.CacheCreator;

@SuppressWarnings("WeakerAccess")
public abstract class DefaultCacheSupport {

    public Cache<Object, Object> getOrCreateCache(String name) {
        if (getCacheCreator() == null) {
            throw new RuntimeException(String.format("Cache %s is not initialized", name));
        }
        return getCacheCreator().getOrCreateCache(name);
    }

    protected abstract CacheCreator getCacheCreator();
}

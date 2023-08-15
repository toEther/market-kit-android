package io.definenulls.marketkit.managers

import io.definenulls.marketkit.models.Post
import io.definenulls.marketkit.providers.CryptoCompareProvider
import io.reactivex.Single

class PostManager(
    private val provider: CryptoCompareProvider
) {
    fun postsSingle(): Single<List<Post>> {
        return provider.postsSingle()
    }
}

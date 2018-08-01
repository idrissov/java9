module impl.prod {
    requires api;
    provides com.github.idrissov.ApiService with com.github.idrissov.prod.ApiServiceProdImpl;

}
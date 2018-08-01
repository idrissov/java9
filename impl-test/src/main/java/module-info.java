module impl.test {
    requires api;
    provides com.github.idrissov.ApiService with com.github.idrissov.test.ApiServiceTestImpl;
}
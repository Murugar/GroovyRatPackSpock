
import ratpack.handling.RequestLogger

import static ratpack.groovy.Groovy.ratpack

ratpack {
    handlers {
        all (RequestLogger.ncsa())
        get {
            render 'Hello, RatPack SpockTest World!'
        }
        get (":name") {
            render "Hello, $pathTokens.name!"
        }
    }
}


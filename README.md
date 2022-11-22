# weird-shutdown-on-aot-issue
a sample showing that a method named `shutdown` on an interface (that isn't otherwise indicated as a bean destructor method) triggers a weird warning in a graalvm aot image.

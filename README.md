
<img align="right" src="https://github.com/maids-life/maidswrapper4j/blob/main/assets/icon.png?raw=true" height="200" width="200">


# Usage

```java
Maids.getRandomImage(EndPoints.MAID); // throws IOException & InterruptedException
```
```java
public String getSafeImage() throws IOException, InterruptedException {
  String random = getRandomImage(EndPoints.MAID);
  return random;
}
```

Availible endpoints: MAID, LEWD, SUGGESTIVE *(**DO NOT** use the ones that start with ``LOCAL``, there are made for local tests)*

# Download

Maven:
```xml
<dependency>
    <groupId>life.maids</groupId>
    <artifactId>maidswrapper4j</artifactId>
    <version>VERSION</version>
</dependency>
```

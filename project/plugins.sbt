lazy val root = (project in file(".")).dependsOn(basePlugin)
lazy val basePlugin = RootProject ( uri( "git://github.com/moglideveloper/BasePlugin" ) )
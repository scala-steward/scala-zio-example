val sbtScalafmt      = "2.5.2"
val sbtScalafix      = "0.12.1"
val sbtTpolecat      = "0.4.4"
val sbtRewarn        = "0.1.3"
val kindProjector    = "0.13.3"
val sbtRevolver      = "0.10.0"
val sbtBuildInfo     = "0.12.0"
val betterMonadicFor = "0.3.1"

addSbtPlugin("org.scalameta"             % "sbt-scalafmt"       % sbtScalafmt)
addSbtPlugin("ch.epfl.scala"             % "sbt-scalafix"       % sbtScalafix)
addSbtPlugin("io.spray"                  % "sbt-revolver"       % sbtRevolver)
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"       % sbtTpolecat)
addSbtPlugin("com.timushev.sbt"          % "sbt-rewarn"         % sbtRewarn)
addSbtPlugin("com.eed3si9n"              % "sbt-buildinfo"      % sbtBuildInfo)
addCompilerPlugin("org.typelevel"        % "kind-projector"     % kindProjector cross CrossVersion.full)
addCompilerPlugin("com.olegpy"          %% "better-monadic-for" % betterMonadicFor)

// Note: Optional plugins:
// (Left commented out to avoid unnecessary dependencies and/or conflicts)

// addDependencyTreePlugin
// sbt dependencyTree

// addSbtPlugin("org.jmotor.sbt" % "sbt-dependency-updates" % "1.2.7")
// sbt dependencyUpdates

// addSbtPlugin("com.github.cb372" % "sbt-explicit-dependencies" % "0.2.16")
// sbt undeclaredCompileDependencies
// sbt unusedCompileDependencies

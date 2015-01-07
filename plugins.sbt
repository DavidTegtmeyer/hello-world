[feature_x 7fb126d] Changed to real Hello World
 Committer: David Tegtmeyer <tegtmeyer@agido.com>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 71 files changed, 1385 insertions(+), 37 deletions(-)
 create mode 100644 hello/hw.scala~
 create mode 100644 target/.history
 create mode 100644 target/resolution-cache/default/hello-world_2.10/0.1-SNAPSHOT/resolved.xml.properties
 create mode 100644 target/resolution-cache/default/hello-world_2.10/0.1-SNAPSHOT/resolved.xml.xml
 create mode 100644 target/resolution-cache/reports/default-hello-world_2.10-compile-internal.xml
 create mode 100644 target/resolution-cache/reports/default-hello-world_2.10-compile.xml
 create mode 100644 target/resolution-cache/reports/default-hello-world_2.10-docs.xml
 create mode 100644 target/resolution-cache/reports/default-hello-world_2.10-optional.xml
 create mode 100644 target/resolution-cache/reports/default-hello-world_2.10-plugin.xml
 create mode 100644 target/resolution-cache/reports/default-hello-world_2.10-pom.xml
 create mode 100644 target/resolution-cache/reports/default-hello-world_2.10-provided.xml
 create mode 100644 target/resolution-cache/reports/default-hello-world_2.10-runtime-internal.xml
 create mode 100644 target/resolution-cache/reports/default-hello-world_2.10-runtime.xml
 create mode 100644 target/resolution-cache/reports/default-hello-world_2.10-scala-tool.xml
 create mode 100644 target/resolution-cache/reports/default-hello-world_2.10-sources.xml
 create mode 100644 target/resolution-cache/reports/default-hello-world_2.10-test-internal.xml
 create mode 100644 target/resolution-cache/reports/default-hello-world_2.10-test.xml
 create mode 100644 target/resolution-cache/reports/ivy-report.css
 create mode 100644 target/resolution-cache/reports/ivy-report.xsl
 create mode 100644 target/streams/$global/$global/$global/streams/out
 create mode 100644 target/streams/$global/dependencyPositions/$global/streams/update_cache_2.10/input_dsp
 create mode 100644 target/streams/$global/dependencyPositions/$global/streams/update_cache_2.10/output_dsp
 create mode 100644 target/streams/$global/ivyConfiguration/$global/streams/out
 create mode 100644 target/streams/$global/ivySbt/$global/streams/out
 create mode 100644 target/streams/$global/projectDescriptors/$global/streams/out
 create mode 100644 target/streams/$global/update/$global/streams/out
 create mode 100644 target/streams/$global/update/$global/streams/update_cache_2.10/inputs
 create mode 100644 target/streams/$global/update/$global/streams/update_cache_2.10/output
 create mode 100644 target/streams/compile/$global/$global/discoveredMainClasses/data
 create mode 100644 target/streams/compile/compile/$global/streams/export
 create mode 100644 target/streams/compile/compile/$global/streams/out
 create mode 100644 target/streams/compile/copyResources/$global/streams/copy-resources
 create mode 100644 target/streams/compile/copyResources/$global/streams/out
 create mode 100644 target/streams/compile/dependencyClasspath/$global/streams/export
 create mode 100644 target/streams/compile/exportedProducts/$global/streams/export
 create mode 100644 target/streams/compile/externalDependencyClasspath/$global/streams/export
 create mode 100644 target/streams/compile/internalDependencyClasspath/$global/streams/export
 create mode 100644 target/streams/compile/mainClass/$global/streams/out
 create mode 100644 target/streams/compile/managedClasspath/$global/streams/export
 create mode 100644 target/streams/compile/run/$global/streams/out
 create mode 100644 target/streams/compile/unmanagedClasspath/$global/streams/export
 create mode 100644 target/streams/compile/unmanagedJars/$global/streams/export
 create mode 100644 target/streams/runtime/dependencyClasspath/$global/streams/export
 create mode 100644 target/streams/runtime/exportedProducts/$global/streams/export
 create mode 100644 target/streams/runtime/externalDependencyClasspath/$global/streams/export
 create mode 100644 target/streams/runtime/fullClasspath/$global/streams/export
 create mode 100644 target/streams/runtime/internalDependencyClasspath/$global/streams/export
 create mode 100644 target/streams/runtime/managedClasspath/$global/streams/export
 create mode 100644 target/streams/runtime/unmanagedClasspath/$global/streams/export
 create mode 100644 target/streams/runtime/unmanagedJars/$global/streams/export

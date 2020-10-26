# Gradle properties --------------------------
org.gradle.caching=true
org.gradle.parallel=true

# Project properties --------------------------
version=1.0.0
semanticVersion=-SNAPSHOT
buildBy=local
buildHash=

# SonarQube --------------------------
systemProp.sonar.host.url=https://sonarcloud.io
systemProp.sonar.organization=zero-88-github
systemProp.sonar.projectKey=zero88_universal-rsql
systemProp.sonar.login=

# Signing -----------------------------
signing.gnupg.executable=gpg
signing.gnupg.useLegacyGpg=false
signing.gnupg.homeDir=
#signing.gnupg.optionsFile=
signing.gnupg.keyName=
signing.gnupg.passphrase=

# Nexus repository --------------------
## --- Sonatype OSSRH
ossrh.snapshot.url=https://oss.sonatype.org/content/repositories/snapshots/
ossrh.release.url=https://oss.sonatype.org/service/local/staging/deploy/maven2
## --- GitHub Package
github.nexus.url=https://maven.pkg.github.com
nexus.username=
nexus.password=

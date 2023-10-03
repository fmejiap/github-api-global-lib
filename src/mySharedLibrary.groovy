// mySharedLibrary.groovy
def checkoutGitRepository(String repositoryUrl, String branch, String targetDir) {
    node {
        stage('Checkout') {
            checkout([$class: 'GitSCM',
                branches: [[name: branch]],
                doGenerateSubmoduleConfigurations: false,
                extensions: [[$class: 'CleanBeforeCheckout'], [$class: 'RelativeTargetDirectory', relativeTargetDir: targetDir]],
                userRemoteConfigs: [[url: repositoryUrl]]])
            // newwwwww
        }
    }
}

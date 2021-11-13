node('master') {

	stage('Execute browser tests') {

		jobqueue = [:]

		jobqueue.put("TestWithChrome", { test_chorme() })
		jobqueue.put("TestWithFirefox", { test_ff() })

		parallel jobqueue
	}

}

def test_chorme() {
    stage('CHROME') {
        echo "Testing with chrome browser"
	    sleep 10
    }
}

def test_ff() {
    stage('FF') {
	    echo "Testing with firefox browser"
	    sleep 10
    }
}
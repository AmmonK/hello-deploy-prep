node {
	stage("Checkout") {
		checkout scm
	}
	stage("Test") {

		sh "./mvnw test -Punit"
	}
}
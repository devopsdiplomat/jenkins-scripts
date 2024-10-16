// This file should be in $JENKINS_HOME/init.groovy.d/ directory.

import jenkins.model.*;

// Put Jenkins in quiet mode when it starts
Jenkins.instance.doQuietDown();

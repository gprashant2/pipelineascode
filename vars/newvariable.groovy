import hudson.EnvVars
import hudson.model.Environment

def build = Thread.currentThread().executable
def vars = [ENV_VAR1: 'value1', ENV_VAR2: 'value2']

build.environments.add(0, Environment.create(new EnvVars(vars)))

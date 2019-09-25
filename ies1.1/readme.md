Francisco Jesus 89084

maven goal: estão associados as fases, quando uma fase é chamada, todos os seus goals são executados. Ou seja, um goal representa parte do build lifecycle de uma fase

principais maven phases e seus goals:as fases principais são: clean->clean:clean, validate, compile->compiler:compile, test->surefire:test, package->jar:jar, install->install:install
							verify, deploy->deploy:deploy

sequência de invocação: validate->compile->test->package->verify->install->deploy
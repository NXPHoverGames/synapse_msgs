#!/usr/bin/env bash
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

antlr4 -Dlanguage=Python3 ${SCRIPT_DIR}/RosIdl.g4 -o ${SCRIPT_DIR}

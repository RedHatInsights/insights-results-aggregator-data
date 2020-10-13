#!/bin/bash
# Copyright 2020 Red Hat, Inc
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# Update the port accordingly (this one is for Kafka running inside Docker)
KAFKA_PORT=9092

# Produce messages from current directory
# All JSON files in current directory will be sent to Kafka via Kafkacat
for file in *.json
do
    echo $file
    kafkacat -b localhost:${KAFKA_PORT} -P -t ccx.ocp.results $file
    # It is possible to change the sleep value (or remove it completely)
    sleep 1
done

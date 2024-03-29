{"ClusterName" "5d5892d3-1f74-4ccf-91af-548dfc9767aa",
 "LastChecked" "2020-04-02T09:00:05.268294Z",
 "OrgID" 11789772,
 "Report" {"fingerprints" [],
           "info" [],
           "pass" [],
           "reports" [{"component" "ccx_rules_ocp.external.rules.nodes_requirements_check.report",
                       "details" {"error_key" "NODES_MINIMUM_REQUIREMENTS_NOT_MET",
                                  "link" "https://docs.openshift.com/container-platform/4.1/installing/installing_bare_metal/installing-bare-metal.html#minimum-resource-requirements_installing-bare-metal",
                                  "nodes" [{"memory" 8.16, "memory_req" 16, "name" "master1", "role" "master"}
                                           {"memory" 8.16, "memory_req" 16, "name" "master2", "role" "master"}
                                           {"memory" 8.16, "memory_req" 16, "name" "master3", "role" "master"}],
                                  "type" "rule"},
                       "key" "NODES_MINIMUM_REQUIREMENTS_NOT_MET",
                       "links" {"docs" ["https://docs.openshift.com/container-platform/4.1/installing/installing_bare_metal/installing-bare-metal.html#minimum-resource-requirements_installing-bare-metal"]},
                       "rule_id" "nodes_requirements_check|NODES_MINIMUM_REQUIREMENTS_NOT_MET",
                       "tags" [],
                       "type" "rule"}
                      {"component" "ccx_rules_ocp.external.rules.samples_op_failed_image_import_check.report",
                       "details" {"error_key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                                  "info" {"condition" "Degraded",
                                          "lastTransitionTime" "2020-03-11T10:00:12Z",
                                          "message" "Samples installed at 4.2.0, with image import failures for these imagestreams: jboss-datagrid72-openshift jenkins-agent-nodejs dotnet redis golang dotnet-runtime apicast-gateway jboss-datagrid73-openshift openjdk-11-rhel7 jboss-eap70-openshift php jenkins-agent-maven jboss-fuse70-karaf-openshift java redhat-sso73-openshift redhat-sso72-openshift jboss-webserver30-tomcat8-openshift jboss-eap72-openshift rhpam73-businesscentral-indexing-openshift jboss-eap71-openshift rhpam73-businesscentral-monitoring-openshift rhdm73-optaweb-employee-rostering-openshift jboss-amq-63 jenkins redhat-sso70-openshift fuse-apicurito-generator fuse7-karaf-openshift fuse7-console python jboss-datavirt64-openshift rhdm73-kieserver-openshift jboss-datagrid65-openshift jboss-fuse70-java-openshift jboss-fuse70-console fuse7-eap-openshift jboss-webserver30-tomcat7-openshift mysql jboss-datagrid71-openshift nginx httpd rhpam73-smartrouter-openshift fis-java-openshift mariadb jboss-fuse70-eap-openshift jboss-decisionserver64-openshift jboss-webserver31-tomcat7-openshift rhdm73-decisioncentral-indexing-openshift mongodb fuse7-java-openshift perl redhat-openjdk18-openshift rhpam73-businesscentral-openshift jboss-datagrid65-client-openshift rhdm73-decisioncentral-openshift apicurito-ui redhat-sso71-openshift nodejs eap-cd-openshift jboss-webserver31-tomcat8-openshift jboss-eap64-openshift jboss-amq-62 postgresql rhpam73-kieserver-openshift jboss-processserver64-openshift jboss-datagrid71-client-openshift modern-webapp jboss-datavirt64-driver-openshift fis-karaf-openshift jboss-webserver50-tomcat9-openshift ruby ",
                                          "name" "openshift-samples",
                                          "reason" "FailedImageImports"},
                                  "kcs" "https://access.redhat.com/solutions/4563171",
                                  "type" "rule"},
                       "key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                       "links" {"kcs" ["https://access.redhat.com/solutions/4563171"]},
                       "rule_id" "samples_op_failed_image_import_check|SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                       "tags" [],
                       "type" "rule"}],
           "skips" [{"details" "All: ['ccx_ocp_core.specs.must_gather_ocs.OperatorsOcsMGOCS'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.ocs.check_ocs_version.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.specs.must_gather_ocs.PodsMGOCS'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.ocs.check_pods_scc.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.specs.must_gather_ocs.OperatorsOcsMGOCS'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.ocs.operator_phase_check.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.specs.must_gather_ocs.PersistentVolumeClaimsMGOCS'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.ocs.pvc_phase_check.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_rules_ocp.ocs.ceph_check_mon_clock_skew.get_mon_reporting_clock_skew'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.ocs.ceph_check_mon_clock_skew.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.models.proxy.Proxy'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1766907.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.cluster_wide_proxy'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.utils.affected_version.ensure_is_affected_condition.<locals>.version_condition'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1798049.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1801300.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1802248.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.rules.image_registry_pv_no_access.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.rules.image_registry_pv_low_capacity.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.rules.image_registry_no_volume_set_check.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.rules.image_registry_pv_not_bound.report",
                     "type" "skip"}],
           "system" {"hostname" nil, "metadata" {}}}}

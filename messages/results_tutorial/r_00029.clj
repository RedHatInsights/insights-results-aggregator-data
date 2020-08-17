{"ClusterName" "5d5892d3-1f74-4ccf-91af-548dfc9767aa",
 "LastChecked" "2020-04-02T09:00:05.268294Z",
 "OrgID" 11789772,
 "Report"
   {"fingerprints" [],
    "info" [],
    "pass" [],
    "reports"
      [{"component"
                "ccx_rules_ocp.external.rules.samples_op_failed_image_import_check.report",
              "details"
                {"error_key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                 "info"
                   {"condition" "Degraded",
                    "lastTransitionTime" "2020-03-31T11:00:24Z",
                    "message"
                      "Samples installed at 4.3.3, with image import failures for these imagestreams: java jboss-decisionserver64-openshift jboss-datavirt64-driver-openshift jboss-eap72-openshift rhpam74-businesscentral-monitoring-openshift mariadb rhdm74-optaweb-employee-rostering-openshift jboss-processserver64-openshift redhat-sso70-openshift mongodb jboss-datagrid65-client-openshift fuse7-console jboss-datagrid72-openshift jboss-webserver30-tomcat8-openshift apicast-gateway redhat-sso72-openshift redis rhpam74-businesscentral-openshift rhpam74-kieserver-openshift jboss-fuse70-console jboss-webserver30-tomcat7-openshift redhat-sso73-openshift fuse7-eap-openshift python fuse-apicurito-generator fis-java-openshift jboss-datagrid71-client-openshift fis-karaf-openshift httpd rhpam74-smartrouter-openshift jboss-fuse70-java-openshift eap-cd-openshift perl jboss-datagrid73-openshift modern-webapp jboss-amq-63 jboss-datagrid71-openshift jboss-webserver50-tomcat9-openshift jboss-eap70-openshift jboss-webserver31-tomcat8-openshift dotnet dotnet-runtime redhat-sso71-openshift postgresql ruby golang redhat-openjdk18-openshift jenkins jboss-eap71-openshift fuse7-java-openshift openjdk-11-rhel7 jenkins-agent-nodejs jboss-fuse70-eap-openshift jboss-fuse70-karaf-openshift nginx rhdm74-decisioncentral-openshift jboss-datagrid65-openshift jenkins-agent-maven jboss-datavirt64-openshift jboss-webserver31-tomcat7-openshift jboss-amq-62 apicurito-ui nodejs fuse7-karaf-openshift mysql rhdm74-kieserver-openshift php jboss-eap64-openshift ; last import attempt 2020-03-31 11:00:23 +0000 UTC",
                    "name" "openshift-samples",
                    "reason" "FailedImageImports"},
                 "kcs" "https://access.redhat.com/solutions/4563171",
                 "type" "rule"},
              "key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR",
              "links" {"kcs" ["https://access.redhat.com/solutions/4563171"]},
              "rule_id"
                "samples_op_failed_image_import_check|SAMPLES_FAILED_IMAGE_IMPORT_ERR",
              "tags" [],
              "type" "rule"}],
    "skips"
      [{"details"
                "All: ['ccx_ocp_core.specs.must_gather_ocs.OperatorsOcsMGOCS'] Any: ",
              "reason" "MISSING_REQUIREMENTS",
              "rule_fqdn" "ccx_rules_ocp.ocs.check_ocs_version.report",
              "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather_ocs.PodsMGOCS'] Any: ",
                                    "reason" "MISSING_REQUIREMENTS",
                                    "rule_fqdn" "ccx_rules_ocp.ocs.check_pods_scc.report",
                                    "type" "skip"} {"details"
                                                            "All: ['ccx_ocp_core.specs.must_gather_ocs.OperatorsOcsMGOCS'] Any: ",
                                                          "reason" "MISSING_REQUIREMENTS",
                                                          "rule_fqdn" "ccx_rules_ocp.ocs.operator_phase_check.report",
                                                          "type" "skip"} {"details"
                                                                                  "All: ['ccx_ocp_core.specs.must_gather_ocs.PersistentVolumeClaimsMGOCS'] Any: ",
                                                                                "reason" "MISSING_REQUIREMENTS",
                                                                                "rule_fqdn" "ccx_rules_ocp.ocs.pvc_phase_check.report",
                                                                                "type" "skip"} {"details"
                                                                                                        "All: ['ccx_rules_ocp.ocs.ceph_check_mon_clock_skew.get_mon_reporting_clock_skew'] Any: ",
                                                                                                      "reason" "MISSING_REQUIREMENTS",
                                                                                                      "rule_fqdn" "ccx_rules_ocp.ocs.ceph_check_mon_clock_skew.report",
                                                                                                      "type" "skip"} {"details" "All: ['ccx_ocp_core.models.nodes.Nodes'] Any: ",
                                                                                                                            "reason" "MISSING_REQUIREMENTS",
                                                                                                                            "rule_fqdn"
                                                                                                                              "ccx_rules_ocp.external.rules.nodes_kubelet_version_check.report",
                                                                                                                            "type" "skip"} {"details" "All: ['ccx_ocp_core.models.nodes.Nodes'] Any: ",
                                                                                                                                                  "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                  "rule_fqdn"
                                                                                                                                                    "ccx_rules_ocp.external.rules.nodes_requirements_check.report",
                                                                                                                                                  "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                                                                                                                                                                        "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                        "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1801300.report",
                                                                                                                                                                        "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                                                                                                                                                                                              "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                              "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1802248.report",
                                                                                                                                                                                              "type" "skip"} {"details"
                                                                                                                                                                                                                      "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                                                    "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                    "rule_fqdn"
                                                                                                                                                                                                                      "ccx_rules_ocp.external.rules.image_registry_pv_no_access.report",
                                                                                                                                                                                                                    "type" "skip"} {"details"
                                                                                                                                                                                                                                            "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                                                                          "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                          "rule_fqdn"
                                                                                                                                                                                                                                            "ccx_rules_ocp.external.rules.image_registry_pv_low_capacity.report",
                                                                                                                                                                                                                                          "type" "skip"} {"details"
                                                                                                                                                                                                                                                                  "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.isImageRegistryPodEmptyDirVolume', 'ccx_rules_ocp.common.conditions.image_registry.isImageRegistryPodPersistentVolume'] Any: ",
                                                                                                                                                                                                                                                                "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                "rule_fqdn"
                                                                                                                                                                                                                                                                  "ccx_rules_ocp.external.rules.image_registry_no_volume_set_check.report",
                                                                                                                                                                                                                                                                "type" "skip"} {"details"
                                                                                                                                                                                                                                                                                        "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                                                                                                                      "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                      "rule_fqdn"
                                                                                                                                                                                                                                                                                        "ccx_rules_ocp.external.rules.image_registry_pv_not_bound.report",
                                                                                                                                                                                                                                                                                      "type" "skip"}],
    "system" {"hostname" nil, "metadata" {}}}}

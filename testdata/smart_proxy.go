package testdata

import (
	"time"

	"github.com/RedHatInsights/insights-operator-utils/types"
	proxy_types "github.com/RedHatInsights/insights-results-smart-proxy/types"
)

var (
	SmartProxyReportResponse3Rules = struct {
		Status string                        `json:"status"`
		Report *proxy_types.SmartProxyReport `json:"report"`
	}{
		Status: "ok",
		Report: &SmartProxyReport3Rules,
	}

	SmartProxyReport3Rules = proxy_types.SmartProxyReport{
		Meta: types.ReportResponseMeta{
			Count:         3,
			LastCheckedAt: types.Timestamp(LastCheckedAt.UTC().Format(time.RFC3339)),
		},
		Data: []proxy_types.RuleWithContentResponse{
			{
				RuleID:       Rule1.Module,
				ErrorKey:     RuleErrorKey1.ErrorKey,
				CreatedAt:    RuleErrorKey1.PublishDate.UTC().Format(time.RFC3339),
				Description:  RuleErrorKey1.Description,
				Generic:      RuleErrorKey1.Generic,
				Reason:       Rule1.Reason,
				Resolution:   Rule1.Resolution,
				TotalRisk:    calculateTotalRisk(RuleErrorKey1.Impact, RuleErrorKey1.Likelihood),
				RiskOfChange: 0,
				Disabled:     Rule1Disabled,
				UserVote:     types.UserVoteNone,
				TemplateData: Rule1.MoreInfo,
				Tags:         RuleErrorKey1.Tags,
			},
			{
				RuleID:       Rule2.Module,
				ErrorKey:     RuleErrorKey2.ErrorKey,
				CreatedAt:    RuleErrorKey2.PublishDate.UTC().Format(time.RFC3339),
				Description:  RuleErrorKey2.Description,
				Generic:      RuleErrorKey2.Generic,
				Reason:       Rule2.Reason,
				Resolution:   Rule2.Resolution,
				TotalRisk:    calculateTotalRisk(RuleErrorKey2.Impact, RuleErrorKey2.Likelihood),
				RiskOfChange: 0,
				Disabled:     Rule2Disabled,
				UserVote:     types.UserVoteNone,
				TemplateData: Rule2.MoreInfo,
				Tags:         RuleErrorKey2.Tags,
			},
			{
				RuleID:       Rule3.Module,
				ErrorKey:     RuleErrorKey3.ErrorKey,
				CreatedAt:    RuleErrorKey3.PublishDate.UTC().Format(time.RFC3339),
				Description:  RuleErrorKey3.Description,
				Generic:      RuleErrorKey3.Generic,
				Reason:       Rule3.Reason,
				Resolution:   Rule3.Resolution,
				TotalRisk:    calculateTotalRisk(RuleErrorKey3.Impact, RuleErrorKey3.Likelihood),
				RiskOfChange: 0,
				Disabled:     Rule3Disabled,
				UserVote:     types.UserVoteNone,
				TemplateData: Rule3.MoreInfo,
				Tags:         RuleErrorKey3.Tags,
			},
		},
	}
)

// TODO: move to utils
func calculateTotalRisk(impact, likelihood int) int {
	return (impact + likelihood) / 2
}

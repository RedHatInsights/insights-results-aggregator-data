// Copyright 2021 Red Hat, Inc
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package testdata

// #nosec G101 (CWE-798): Potential hardcoded credentials
const (
	// BadJWTAuthBearer contains:
	// {
	// 	"account_number": "5213476",
	// 	"org_id": "1234"
	// }
	BadJWTAuthBearer = "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2NvdW50X251bWJlciI6IjUyMTM0NzYiLCJvcmdfaWQiOiIxMjM0In0.Y9nNaZXbMEO6nz2EHNaCvHxPM0IaeT7GGR-T8u8h_nr_2b5dYsCQiZGzzkBupRJruHy9K6acgJ08JN2Q28eOAEVk_ZD2EqO43rSOS6oe8uZmVo-nCecdqovHa9PqW8RcZMMxVfGXednw82kKI8j1aT_nbJ1j9JZt3hnHM4wtqydelMij7zKyZLHTWFeZbDDCuEIkeWA6AdIBCMdywdFTSTsccVcxT2rgv4mKpxY1Fn6Vu_Xo27noZW88QhPTHbzM38l9lknGrvJVggrzMTABqWEXNVHbph0lXjPWsP7pe6v5DalYEBN2r3a16A6s3jPfI86cRC6_oeXotlW6je0iKQ"
	// #nosec G201

	// GoodJWTAuthBearer contains:
	// {
	// 	"account_number": "5213476",
	// 	"org_id": "1",
	// 	"jti": "05443b99-d824-480b-a4be-37977405f093",
	// 	"iat": 1594126340,
	// 	"exp": 2556144000
	// }
	GoodJWTAuthBearer = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhY2NvdW50X251bWJlciI6IjUyMTM0NzYiLCJvcmdfaWQiOiIxIiwianRpIjoiMDU0NDNiOTktZDgyNC00ODBiLWE0YmUtMzc5Nzc0MDVmMDkzIiwiaWF0IjoxNTk0MTI2MzQwLCJleHAiOjI1NTYxNDQwMDB9.nkc5taqc5pjMQKDDhmDH4gkhPckezxMSf3ZLmVl4eBA"

	// UnparsableJWTAuthBearer cannot be parsed
	UnparsableJWTAuthBearer = "Bearer this_is^not.a-token"

	// IncompleteJWTAuthBearer is goodJWTAuthBearer without account_number
	IncompleteJWTAuthBearer = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJvcmdfaWQiOiIxIiwianRpIjoiMDU0NDNiOTktZDgyNC00ODBiLWE0YmUtMzc5Nzc0MDVmMDkzIiwiaWF0IjoxNTk0MTI2MzQwLCJleHAiOjE1OTQxNDE4NDd9.P6-6BJ4hUpLzCqsmGHthe0B1opU3Tz6nMtCQ-Yvuea4"

	// InvalidJWTAuthBearer is goodJWTAuthBearer with the org_id type set as int
	InvalidJWTAuthBearer = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhY2NvdW50X251bWJlciI6IjUyMTM0NzYiLCJvcmdfaWQiOjEsImp0aSI6IjA1NDQzYjk5LWQ4MjQtNDgwYi1hNGJlLTM3OTc3NDA1ZjA5MyIsImlhdCI6MTU5NDEyNjM0MCwiZXhwIjoxNTk0MTQxODQ3fQ.GndJUWNaG4IWm8OkKBs_1uvD1-vaJqL2Xvf9QiGvlRw"
)
